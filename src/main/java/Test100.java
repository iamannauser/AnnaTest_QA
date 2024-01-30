import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.Assert.assertEquals;


public class Test100 {

 @Test
     public void testTranslationToEnglish() {
         open("https://translate.google.com/?sl=uk&tl=en&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20%D1%82%D0%B5%D1%81%D1%82%D0%BD%D0%B3&op=translate");

         String expectedTranslation = "I will study TestNG cool";
         String actualTranslation = $(By.cssSelector(".translation")).text();

         assertEquals("Translation to English does not match", expectedTranslation, actualTranslation);
     }

    @Test
    public void testTranslationToJapanese() {
        open("https://translate.google.com/?sl=uk&tl=ja&text=%D0%AF%20%D0%BA%D1%80%D1%83%D1%82%D0%BE%20%D0%B2%D0%B8%D0%B2%D1%87%D1%83%20%D1%82%D0%B5%D1%81%D1%82%D0%BD%D0%B3&op=translate");

        String expectedTranslation = "私はTestNGをかっこよく勉強します";
        String actualTranslation = $(By.cssSelector(".translation")).text();

        assertEquals("Translation to Japanese does not match", expectedTranslation, actualTranslation);
    }



 }


