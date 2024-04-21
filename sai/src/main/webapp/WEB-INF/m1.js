let un = localStorage.getItem("username");
let p = localStorage.getItem("password");
let hin = localStorage.getItem("hint");
function hint(){
    document.getElementById("hint").innerHTML = hin;
}
let l = document.getElementById("input1");
let pass = document.getElementById("password1");
function login(){
    if(l.value=="" || pass.value =="")
    {
        window.alert("sign in")
    }else{
    if(l.value == un && pass.value == p){
        window.open("m3.html");
    }
    else{
        window.alert("invalid username or password");
    }
}
}