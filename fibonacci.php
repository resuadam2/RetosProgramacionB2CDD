<?php
/*
Enunciado: Escribir una función en PHP que devuelva el n-ésimo término de la secuencia de Fibonacci.
*/

function fibonacci($n) {
    if ($n <= 1)
        return $n;
    else
        return fibonacci($n - 1) + fibonacci($n - 2);
}

$n = 10; // Número de términos da secuencia de Fibonacci a calcular
echo "O " . $n . "º término da secuencia de Fibonacci é: " . fibonacci($n);
?>
