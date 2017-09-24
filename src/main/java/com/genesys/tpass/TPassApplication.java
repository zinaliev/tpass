package com.genesys.tpass;


import com.genesys.tpass.api.PasswordResource;
import com.genesys.tpass.api.StatisticsResource;
import com.genesys.tpass.conf.TPassConfiguration;
import com.google.common.base.Joiner;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TPassApplication extends Application<TPassConfiguration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(TPassApplication.class);

    public static void main(String[] args) throws Exception {

        // for manual debugging
        if(args.length == 0){
            args = new String[2];
            args[0] = "server";
            args[1] = "C:\\Store\\DEVEL\\REPOS\\GitHub\\unspecified\\tpass\\src\\main\\resources\\tpass.yml";
        }

        LOGGER.info("Running with args '{}'", Joiner.on(' ').join(args));
        new TPassApplication().run(args);
    }

    @Override
    public void run(TPassConfiguration tPassConfiguration, Environment environment) throws Exception {

        environment.jersey().register(new StatisticsResource());
        environment.jersey().register(new PasswordResource());
    }
}
