<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Administration Portal</title>
    
    <link rel="stylesheet" href="style.css">
    <script type="text/javascript">
            function fun1(){
                var bars = document.getElementById('bars');
                var nav = document.getElementById('nav');

                //adding events

                bars.addEventListener("click",displaynav,false);
            }
            window.onload = fun1;

            function displaynav(){
                nav.classList.toggle("active2");
            }
    </script>
    <style>
        body{
    margin:0;
    padding:0;
    background:#fafafa;
    font-family:'poppins',sans-serif;
    overflow-X: hidden;
}
.banner{
    position: relative;
    height:100vh;
    width:100%;
    background:linear-gradient(rgba(0, 0, 0, 0.55),rgba(0, 0, 0, 0.55)),url('https://wallpaperaccess.com/full/1426881.jpg');
    background-repeat: no-repeat;
    background-position: center;
    color:#fff;
}
.banner header{
    height:40px;
    position: absolute;
    width:100%;
    margin-top:3%;
    display: flex;
    z-index: 998;
}
.banner header .logo{
    position: relative;
    margin-left:10%;
    font-size:35px;
    font-weight:600;
}
.banner header .logo span{
    color:rgb(0, 0, 0);
}
.banner header nav{
    position: relative;
    height:auto;
    width:50%;
    margin-left:35%;

}
.banner header nav ul{
    position: relative;
}
.banner header nav ul li{
    list-style: none;
    display: inline-block;
    margin:0;
}
.banner header nav ul li a{
    text-decoration: none;
    color:#fff;
    transition: 0.5s all ease-in-out;
    padding:10px;
    margin:0;
    border-radius: 5px;
}
.banner header nav ul li a:hover,
.banner header nav ul li a.active{
    color:rgbrgb(135,206,235);
    background:rgba(255, 255, 255, 0.5);
}
.banner header .bars{
    position: absolute;
    right:10%;
    font-size:24px;
    border-radius: 5px;
    padding:10px;
    border:1px solid rgbargb(135,206,235 0.5);
    cursor: pointer;
    transition: 0.5s all ease-in-out;
    z-index: 1;
    display: none;
}
.banner header .bars:hover{
    color:rgb(135,206,235);
    border-color:rgbrgb(135,206,235);
}
.banner .info{
    position: absolute;
    top:50%;
    transform: translateY(-50%);
    width:100%;
    height:auto;
    text-align: center;
}
.banner .info h1{
    font-size:48px;
    font-weight: 550;
    color: white;
}

.banner .info p{
    font-family:'cinzel',sans-serif;
    font-size:24px;
    margin-top:-2%;
}


@media(max-width:980px){
    .banner header nav{
        width:60%;
        margin-left:20%;
    }
}
@media(max-width:768px){
    .banner header{
        display: flex;
        flex-direction: column;
    }
    .banner header .logo{
        width:100px;
        text-align: center;
    }
    .banner header .active2{
        display: none;
    }
    .banner header nav{
        position: relative;
        width:100%;
        margin-left:-2%;
    }
    .banner header nav ul{
        width:100%;
        position:relative;
        margin-left:-6%;
    }
    .banner header nav li{
        position: relative;
        display: block;
        width:100%;
        text-align: center;
        margin-left:-20%;
    }
    .banner header nav li a{
        display: block;
        width:100%;
        margin-left:-10%;
    }
    .banner header .bars{
        display: block;
    }
    .banner .info h1{
        font-size:25px;
        color:white;
    }
}

    </style>
</head>
<body>
    <div class="banner">
        <header>
            
            <div class="bars" id="bars">
                <i class="fa fa-bars"></i>
            </div>
            <nav id="nav" class="active2">
                <ul>
                    
                   <li> <a href="openAdminLoginPage">Admin Login</a></li>
                    <li><a href="openTrainerLoginPage">Trainer Login</a></li>
                    <li><a href="openTraineeLoginPage">Student Login</a></li>
                   
       
                    
                </ul>
            </nav>
        </header>
        <div class="info">
            <h1>TRAINING ADMINISTRATION <span>PORTAL</span></h1>
            <p>Explore our Comprehensive training programs</p>
        </div>
    </div>
</body>
</html>