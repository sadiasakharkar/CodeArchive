<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Multi-Dimensioal Array</title>
</head>
<body>
    <?php
    $student = array(array(501,"Haris", 65),
                      array(502,"Madhu", 76),
                      array(503,"Naha" , 87) 
                    );

    for ($i = 0; $i < 3; $i++) {
        for ($j = 0; $j < 3; $j++) {
            echo $student[$i][$j]." ";
        }
        echo "<br>";
    }
    ?>
</body>
</html>
