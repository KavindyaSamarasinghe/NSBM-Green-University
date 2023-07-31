<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registration Form Data</title>
  <style>
    body {
      margin: 0 auto;
      padding: 20px;
    }

    table {
      border-collapse: collapse;
      width: 100%;
    }

    th, td {
      border: 1px solid #ccc;
      padding: 8px;
      text-align: left;
    }

    th {
      background-color: lightblue;
    }
  </style>
</head>
<body>

  <?php
  if ($_SERVER["REQUEST_METHOD"] === "POST") 
  {
    $first_name = isset($_POST["first_name"]) ? $_POST["first_name"] : "";
    $last_name = isset($_POST["last_name"]) ? $_POST["last_name"] : "";
    $password = isset($_POST["password"]) ? $_POST["password"] : "";
    $gender = isset($_POST["gender"]) ? $_POST["gender"] : "";
    $academic_year = isset($_POST["academic_year"]) ? $_POST["academic_year"] : "";
    $email = isset($_POST["email"]) ? $_POST["email"] : "";
    $phone_no = isset($_POST["phone_no"]) ? $_POST["phone_no"] : "";

   
    $form_data = array
    (
      "First Name" => $first_name,
      "Last Name" => $last_name,
      "Password" => $password,
      "Gender" => $gender,
      "Academic Year" => $academic_year,
      "Email" => $email,
      "Phone No" => $phone_no,
    );

 
    echo '<table>';
    foreach ($form_data as $label => $value) 
    {
      echo '<tr><th>' . htmlspecialchars($label) . '</th><td>' . htmlspecialchars($value) . '</td></tr>';
    }
    echo '</table>';
  }
  ?>
</body>
</html>