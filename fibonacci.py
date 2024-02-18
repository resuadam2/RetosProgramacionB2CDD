'''
Enunciado: Escribir una función en Python que devuelva el n-ésimo término de la secuencia de Fibonacci.
'''

def fibonacci(n):
    if n <= 1:
        return n
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

if __name__ == "__main__":
    n = 10  # Número de términos da secuencia de Fibonacci a calcular
    print(f"O {n}º término da secuencia de Fibonacci é: {fibonacci(n)}")
