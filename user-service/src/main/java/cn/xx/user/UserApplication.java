package cn.xx.user;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

    private static final Logger log = LoggerFactory.getLogger(UserApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(UserApplication.class, args);
        ConfigurableEnvironment env = run.getEnvironment();
        logApplicationStartup(env);
    }

    /**
     * 打印服务地址
     * @param env
     */
    private static void logApplicationStartup(Environment env) {
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        //服务端口
        String serverPort = env.getProperty("server.port");
        //服务名
        String contextPath = StringUtils.isBlank(env.getProperty("server.servlet.context-path"))? "/":env.getProperty("server.servlet.context-path");

        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\t{}://localhost:{}{}\n\t" +
                        "External: \t{}://{}:{}{}\n\t" +
                        "Swagger: \t{}://localhost:{}{}{}\n\t"+
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                protocol, serverPort, contextPath,
                protocol, hostAddress, serverPort, contextPath,
                protocol, serverPort,contextPath, "/doc.html");
    }
}
