1. mvn versions:display-dependency-updates
   The following dependencies in Dependencies have newer versions:
      io.github.bonigarcia:webdrivermanager ................. 4.4.3 -> 5.0.1
      org.seleniumhq.selenium:selenium-chrome-driver ...
                                                      3.141.59 -> 4.0.0-rc-1
      org.seleniumhq.selenium:selenium-ie-driver .... 3.141.59 -> 4.0.0-rc-1
      org.seleniumhq.selenium:selenium-support ...... 3.141.59 -> 4.0.0-rc-1

2. mvn clean test
   Results :
   Failed tests: logOut(com.saucedemo.locator.LogOutTest): 
   element not interactable(..)
   Tests run: 6, Failures: 1, Errors: 0, Skipped: 0
   Total time:  01:52 min

3. mvn -Dtest=LogOutTest test
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, 
   Time elapsed: 15.879 s - in com.saucedemo.locator.LogOutTest
    Results:
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    BUILD SUCCESS
    Total time:  25.866 s
