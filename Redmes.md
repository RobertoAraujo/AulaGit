git init                       // inicializa o git 
git config --global -e         // Para ver as configurções do globais git 
ctrl + c :qa!                 // como sair do editor
ctrl + c :i                   // inserir
ctrl + c :wq                 // salva

git config --global user.name  "Roberto Araujo"     //add um usuarios 
git config --global user.email fulanodetal@exemplo.br  // add um email 
git log                       // history de commits
git log --autor=nome-autor    // history do autor

git featch                     // mostra se a atualização 
git status                     // mostra o status da area de tranferencia
git add .                      // add sobe para a are de tranferencia  
git add --all                      // add sobe para a are de tranferencia  sem ver o log
git log                        // ver o commits 
git show                       // ver tudo detalhado que foi commitado
git branch -M main             // crai uma nova tira da master e manda pra main 
git branch -b nomeDaBranch     // Listando Branches
git add .gitignore             // adiciona um arquivo a ser ignorado
git remote remove origin       // remove o origin remote
git remote add origin git@github.com:RobertoAraujo/ListaDeCompas.git // add um remote novo
git push -u origin main       // add tudo o que vc commitou
git remote -v                 // verifica qual o remote
git revert HEAD               // Desfazendo o último commit
git reset .                   // tirando do stash area de transferencia
git commit --amend            // Renomear Commit
											
git log --after="MMM DD YYYY"    // Histórico por Data
git log --before="MMM DD YYYY" // Histórico por Data