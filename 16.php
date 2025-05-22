<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $con =mysqli_connect('localhost','root','resham@silk','student');
    $q="insert into profile values (101,'saziya',310002221002)";
    $rs=mysqli_query($con,$q);
    if($rs){
        echo"saved";
    }else{
        echo"Error";
    }
    ?>
</body>
</html>