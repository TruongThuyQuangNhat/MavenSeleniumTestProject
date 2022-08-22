package chat;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ChatPage;
import pages.LoginPage;

public class ChatTests extends BaseTests {
    @Test
    public void testSuccessChat() throws InterruptedException {
        LoginPage loginPage = homePage.clickToLogin();
        loginPage.Login("0943654523","Test-Selenium-T1k1");
        ChatPage chatPage = homePage.HomeChatPage();
        Thread.sleep(5000);
        chatPage.enterChatBtn();
        Thread.sleep(10000);
        chatPage.enterSearchChat("nha");
        chatPage.enterSearchNhaBan();
        chatPage.chooseShop(3);
        chatPage.enterInputChat("Team Dev: Test | No Reply");
        chatPage.enterSendChat();
    }
}
