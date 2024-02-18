<?php
/*
Enunciado: Escribir una función en PHP que realice una búsqueda binaria en un array ordenado y devuelva el índice del elemento buscado, si está presente. Si no está presente, devolver -1.
*/

function busquedaBinaria($array, $elemento) {
    $inicio = 0;
    $fin = count($array) - 1;

    while ($inicio <= $fin) {
        $medio = $inicio + intval(($fin - $inicio) / 2);

        if ($array[$medio] == $elemento)
            return $medio;
        elseif ($array[$medio] < $elemento)
            $inicio = $medio + 1;
        else
            $fin = $medio - 1;
    }

    return -1;
}

$array = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]; // Array ordenado
$elemento = 13; // Elemento a buscar

$resultado = busquedaBinaria($array, $elemento);

if ($resultado != -1)
    echo "O elemento " . $elemento . " foi encontrado no índice " . $resultado . ".";
else
    echo "O elemento " . $elemento . " non foi encontrado no array.";
?>
