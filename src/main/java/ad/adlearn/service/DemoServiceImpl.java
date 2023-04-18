package ad.adlearn.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String getHelloMessage(String user) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ").append(user);
        return sb.toString();
    }

    @Override
    public String getWelcomeMessage() {
        return "Welcome to this Demo Application";
    }
}
