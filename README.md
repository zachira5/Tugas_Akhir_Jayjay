**Tools dan Library dalam pembuatan final project :**

    1. Git and GitHub
    2. Java
    3. Gradle
    4. Rest Assured
    5. Selenium
    6. Cucumber
    7. GitHub Actions

**Project**

    1. Membuat Web UI Test gunakan website berikut sebagai target dan pembuatan test scenario: https://www.demoblaze.com/
    2. Membuat API test, gunakan public API berikut: 
        - https://dummyapi.io/docs/user (Get User by ID, Create User, Update User, Delete User) 
        - https://dummyapi.io/docs/tag (Get List of Tags) 
        
**Detail**

    1. Automation test framework disimpan sebagai repository di Github
    2. Untuk test web ui dan api dibuat dalam satu repository
    3. Test case untuk Web dan API harus menggunakan Gherkin format dan gunakan Cucumber sebagai library untuk implementasinya
    4. Package dibuat terpisah pada Java Code, Step Definitions dan Feature untuk masing-masing jenis test (Web dan API)
    5. Untuk menjalankan fungsi, Gradle Task dibuat menjadi 2 yaitu :
           - Execute semua cucumber test yang memiliki tag @api
           - Execute semua cucumber test yang memiliki tag @web
    6. Report menggunakan Cucumber untuk format HTML dan JSON
    7. Untuk menjalankan test yang sudah dibuat maka disini GitHub Actions workflow dengan cara (event) manual trigger dan setiap kali ada Pull Request
    8. Menambahkan README file untuk setiap informasi penting dari repository 

**TEST CASE**

    **API**
    1. get all user
    2. get specific user 
    3. get list user of tags
    4. create user 
    5. update user
    6. delete user 
    	
    **WEB** 
    1. Sign Up dengan username dan password kosong
    2. Sign Up dengan username dan password yang sesuai
    3. Sign up dengan username dan password yang telah terdaftar
    4. Login dengan username dan password yang sesuai
    5. Login dengan password yanag tidak sesuai
    6. Cancel login
    7. Show product
    8. Send message from contact menu
    9. Logout

