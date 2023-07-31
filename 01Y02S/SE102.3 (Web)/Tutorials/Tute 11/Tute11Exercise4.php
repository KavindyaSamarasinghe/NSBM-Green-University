<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Days of the week</title>
</head>
<body>
<?php

function getDayOfWeek($number)
 {
  switch ($number)
   {
    case 1:
      return "Monday";
    case 2:
      return "Tuesday";
    case 3:
      return "Wednesday";
    case 4:
      return "Thursday";
    case 5:
      return "Friday";
    case 6:
      return "Saturday";
    case 7:
      return "Sunday";
    default:
      return "Invalid number";
  }
}


$dayNumber = 3; 
$dayOfWeek = getDayOfWeek($dayNumber);
echo "Number: $dayNumber <br>";
echo "Day of the Week: $dayOfWeek";
?>
</body>
</html>