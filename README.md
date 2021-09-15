## Sbt_Assignment

# README

## Github Repository link
```bash
git clone https://github.com/Shashikant-15/Sbt_Assignment.git
```

## Install sbt using link and commands:
```bash
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
sudo apt-get update
sudo apt-get install sbt
```

## Run the following commands for further  check
```bash
sbt clean
sbt compile
sbt package
```



