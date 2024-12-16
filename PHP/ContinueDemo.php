<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Continue Demo</title>
</head>
<body>
    <?php
        for ($n = 1; $n <= 10; $n++) {
            if ($n % 2 == 0) {
                continue; // Skip the next statement if $n is even
            }
            echo "$n <br>";
        }
    ?>
</body>
</html>
