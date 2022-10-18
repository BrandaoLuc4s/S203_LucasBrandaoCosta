class Pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencia = "Ilha Bela"
    olhos = "azuis"

class Filha(Pai):
    nome = "Luciana"
    olhos = "castanhos"

class Neta(Filha):
    nome = "Maria"

print("\n""Nome: ")
print(Pai.nome)
print(Filha.nome)
print(Neta.nome)

print("\n""Residencias: ")
print(Pai.residencia)
print(Filha.residencia)
print(Neta.residencia)

print("\n""Olhos: ")
print(Pai.olhos)
print(Filha.olhos)
print(Neta.olhos)

class Pessoa(object):
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        self.idade += 1

class Atleta(Pessoa):
    peso = None
    aposentado = None
    
    def __init__(self, nome, idade, peso):
        super(),__init__(nome, idade)
        self.peso = peso
    
    def aquecer(self):
        print("Atleta aquecido")

    def aposentar(self):
        self.aposentado = True

print(Atleta.peso)


