
let loginBtn = document.getElementById("loginBtn");
let usernameBox = document.getElementById("username");
let passwordBox = document.getElementById("password");
let logoutBtn = document.getElementById("logoutBtn");

const url = "http://localhost:8080/";

if (sessionStorage.getItem("userSession") == null){
  logoutBtn.innerHTML = "";
}
loginBtn.addEventListener("click", loginFunc);

async function loginFunc(){
    let user = {
        username: usernameBox.value,
        password: passwordBox.value
    }

    console.log("User and Pass:" + user.username + " | " + user.password);

    let response = await fetch(
        url+"login",
        {
          method : "POST",
          body : JSON.stringify(user),
          credentials: "include"
        }
      );
    
      if(response.status===200){
        let user_info = await response.json();
        sessionStorage.setItem("userSession", user_info);
        if (user_info.userRoleId == 1) {
            window.location.replace(url + "employee.html");
        } else {
            window.location.replace(url + "manager.html");
        }
      }else{
        console.log("Incorrect info "+response.status);
      }

}