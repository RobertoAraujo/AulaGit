# Aula 00 - Git e GitHub
## _Principais comandos do Git_
## Instalação
colocar aqui como instalar o git

## Principais comando do git
Para visualizar as configurações globais do git
```sh
git config --global -e
```
```sh
# Para sair
# digita ctrl + c
:qa!
#para editar e salvar
# I para editar
# digita ctrl + c
:qw
```
Add configurações de nome e email no git
```
# seu nome da forma que você quer que seja registro no commit
git config --global user.name "Antonio Motta"

# seu email, de preferencia o mesmo registro no repositorio
git config --global user.email "fmotta.antonio@gmail.com"
```
Inicializando o git
```
git init
```
Para vizualizar o status do arquivos no git
```
git status
```
Legenda:
Vermelho: O git não encherga, ou seja, não vai entrar no git
Verde: o git enxerga

para ignorar os arquivos usar .gitignore
```
vim .gitignore
#dica: estudar uso do vim
```
para ver os ultimos commits
```
git log
```
para ver as alterações do ultimo commit
```
git show
```
para criar chave ssh
```
ssh-keygen -t rsa -b 4096 -C "example@gmail.com"
```
para identificar o local onde foi salvo procure no log gerado o seguinte trecho
<b>Your public key has been saved in</b> ... <br/>
para visualizar a chave use o cat, por exemplo:
```
cat /c/Users/sefaz/.ssh/id_rsa.pub
```
Insira essa chave no ssh do github e use as instruções de inicialização de repositorio do github, conforme a sua necessida, descritas no diretorio do projeto recem criado.
