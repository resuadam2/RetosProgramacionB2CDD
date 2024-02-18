'''
Enunciado: Escribir una función en Python que realice una búsqueda binaria en una lista ordenada y devuelva el índice del elemento buscado, si está presente. Si no está presente, devolver -1.
'''

def busqueda_binaria(lista, elemento):
    inicio = 0
    fin = len(lista) - 1

    while inicio <= fin:
        medio = inicio + (fin - inicio) // 2

        if lista[medio] == elemento:
            return medio
        elif lista[medio] < elemento:
            inicio = medio + 1
        else:
            fin = medio - 1

    return -1

if __name__ == "__main__":
    lista = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]  # Lista ordenada
    elemento = 13  # Elemento a buscar

    resultado = busqueda_binaria(lista, elemento)

    if resultado != -1:
        print(f"O elemento {elemento} foi encontrado no índice {resultado}.")
    else:
        print(f"O elemento {elemento} non foi encontrado na lista.")
