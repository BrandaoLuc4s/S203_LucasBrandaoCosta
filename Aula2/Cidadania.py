class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade

class Cidadao(Pessoa):
    cpf = None

    def __init__(self, cpf, nome, sexo, idade):
        super().__init__(nome, sexo, idade)
        self.cpf = cpf

mensagem = print("Entre com os parametros:")
Cidadao.nome = input("\n""Nome:")
Cidadao.sexo = input("\n""Sexo:")
Cidadao.idade = input("\n""Idade:")
Cidadao.cpf = input("\n""Cpf:")

print(Cidadao.nome)
print(Cidadao.idade)
print(Cidadao.sexo)
print(Cidadao.cpf)



    
