import cn.itcast.travel.util.MailUtils;
import org.junit.Test;

/**
 * Created by cdx on 2019/12/27.
 * desc:
 */
public class TestMail {
    @Test
    public void sendMail() {
        boolean mail = MailUtils.sendMail("08chendongxiao@sina.com", "mail", "测试发邮件");
        if (mail)
            System.out.println("发送成功");
        else System.out.println("发送失败");
    }
}
