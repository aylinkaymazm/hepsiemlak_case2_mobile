# hepsiemlak_case2_mobile

 Its a Selenium with Java Automation desktop mobile case project.

This project used maven , junit , log4j and page object model (POM)

Here these case steps:

-case goto hepsiemlak.com

-click the "Kiralık”

-filters are

1.Ankara

2.Çankaya

3.Konut

4.2+1

5.Site içerisinde:Evet

-search and page list opened

-Click 3rd listing on the results and go to listing detail page

-On the Detail page there is a “Telefon Numarasini Goster” link on the right

-Validate the phone number that it is a real and valid mobile or landline number. (eg. +905xxxxxxxxx , +90212xxxxxxx)

If U want to download your steps are here.

if u use like intellije

i'm advice maven and java 1.8sdk down and select your project structure

Check your POM.XML file

maven ,junit,log4j versions are so important


and in intellije click to left side 

big blue 'M' its Maven target and we wait everything gonna be build.

13seconds later..................



check your browser version and its a web case download 

chromedriver.exe in -------> https://chromedriver.chromium.org/downloads

check your driver i create 4 java file in hepsiemlak_case2_desktopp/src/test/java/ road

WebElementsConstants.java --->all locators are here absolutely everytime check locator 

TestSteps.java ---> all case steps functions is here. 

TestCases.java ---> call the TestSteps.java function

BaseMethods.java ---> run my element function with driver in these file
