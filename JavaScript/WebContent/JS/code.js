
function greetings(){
   //alert(document.loginform.username.value);
   
   sum(7,7);
   sum('7','7');
}

function sum(num1,num2){
	var result=num1+num2;
	alert(result);
	}

var myFunction = function(var1,var2){
	return(var1+var2);
}

var sum = myFunction(10,30);
alert(sum);   

function test1(){
	var1=1;
}

test1(); //once var1 is initialed it can be used by test2, global, if we make it var var1 then it becomes local

function test2(){
 alert(var1);
}

test2();

function display(){
	var hd= document.getElementById('hellodiv');
	hd.innerHTML = 'Clicked'; 
}