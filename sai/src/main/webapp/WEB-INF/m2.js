let a = document.getElementById('n');
    let b = document.getElementById('un');
    let c = document.getElementById('p');
    let d = document.getElementById('cp');
    let e = document.getElementById('m');
    let f = document.getElementById('h');
    let k=0;
function myfunc(){
    let z = ( a || b || c || d);
    if(z.value == "" || e.value == 0)
    {
        window.alert("please give the values");
        //k=1;
    }
    else if(c.value != d.value){
        window.alert("please give the same password");
        //k=1
    }
    else{
        window.open("m1.html");
        //k=1
    }
}

const form = document.getElementById("form");
form.addEventListener('submit',function(e){
e.preventDefault();
localStorage.setItem("hint",f.value);
}
)