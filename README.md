# Test sysdig login using selenium 
## Author: Ricardo Ayala

Java example to test sysdig login using selenium and chrome

## Execution

```bash
gradle clean test
```

## Sysdig login features

- Select your login zone
- Login
- Forgot password
- Login using third party login services
- Sign up

## Test

- login ok
- login ko
- create user (hardcore data)
- login third party (google) - Fail, google detect no secure browser.

## Improvements

- Data driven - Execute test using different entry data (For example, login test using diffenrent users for different regions with different password)

- Obtain data form DB to test users with the same characteristic by different data (For example, you want a user from EU with all products selected like User user = UserBuilder.withRegion(Region.EU).withSelectedProduct(Product.ALL).isEmailValidate(Boolean.TRUE).build()) Each time you execute, you have different user but same characteristic.

- All the functionality and fields should be implement with Page Object Pattern

- Logging info using same class and same way to show it
