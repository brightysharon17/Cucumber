Feature: To validate the Login Funtionality in FB application


Scenario: To validate Login Functionality by passing invalid values

Given To open a browser and maximize
When To launch the FB application
And To pass the invalid username in email field
And To pass the invalid password in password field
And To click a  login button
And To check whether it should navigate to the error page or home page
Then To close a browser

@Sanity
Scenario Outline: To validate positive and negative combination Testcases

Given To launch the browser and max window
When  To launch url of the application
When  To pass positive and negative "<emaildata>" data to email field
When  To pass positive and "<passworddata>" negative data to password field

And   To click login button
Then  Close the browser


Examples:

|emaildata|passworddata|
|java|Java123|
|Cucumber|cucumber123|
|Selenium|selenium123|





