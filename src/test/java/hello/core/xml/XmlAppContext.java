package hello.core.xml;

import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {

    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext();
        MemberService memberSevice = ac.getBean("memberSevice", MemberService.class);
        Assertions.assertThat(memberSevice).isInstanceOf(MemberService.class);
    }
}