package controllers;

import drools.Message;
import play.mvc.*;

import plugins.Drools;

import javax.inject.Inject;

public class Application extends Controller {

    @Inject
    Drools drools;

    public Result index() {

        final Message message = new Message();
        message.setMessage("hello, world");
        message.setStatus(Message.HELLO);
        drools.kieSession.insert(message);
        drools.kieSession.fireAllRules();

        return ok("rules are running... check the console.");
    }

}
