<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stud_Reg</title>
</head>
<body>
     <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <form method="POST" enctype ="multipart/form-data" action="addstud_2.php">
        Rollno  <input type="text" name="t1"><br><br>
        Name:  <input type="text" name="t2"><br><br>
        Branch  <select name="t3">
                <option>CSE</option>
                <option>Civil</option>
               <option>Electrical</option>
               <option>Mechnical</option>
                </select><br><br>
        Sem  <select name="t4">
             <option>1</option>
             <option>2</option>
             <option>3</option>
            <option>4</option>
            </select><br><br>
        Mobileno.:  <input type="text" name="t5"><br><br>
        Address:  <input type="text-area" name="t6"><br><br>
        Photo: <input type = "file" name="image"><br><br>
        <input type="submit" value="save">
   </form>
</body>
</html>