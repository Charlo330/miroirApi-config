# Projet Mirroir API

Cette Api à été conçue pour un projet scolaire de miroir intelligent qui avait besoin d'une API pour lier une application desktop et une application mobile grâce à des Websockets.



## Prérequis
Vous devez avoir docker d'installer sur votre machine.

https://docs.docker.com/engine/install/

## Setup projet
1) Renommer le fichier ".env.docker.template" en ".env.docker"
2) À l'intérieur du fichier <u>.env.docker</u>,il sera nécéssaire de bien définir les variables d'environnements :
  - DB_HOST : nom du conteneur mysql
    - Par défaut : mysql
  - DB_NAME : nom de la base de données
    - Par défaut : miroirDb
  - DB_USER : nom d'utilisateur de la base de données
    - Par défaut : root
  - DB_PASS : mot de passe de la base de données
    - Par défaut : root



## Lancer le projet
  Pour lancer le projet, il suffit d'exécuter la commande suivante :

    docker compose up

## Documentation API
Le projet est documenté avec Swagger, vous pouvez accéder à la documentation lorsque votre projet est démarré à l'adresse suivante:
http://localhost:80/swagger-ui/index.html

## Documentation WebSocket
### Subscribe

Update sur les configurations :
``/user/{USERID}/queue/private``


Objet Reçu :
JSON
<div style="border-style:solid; padding: 2px;">

"configName": Le nom de la config,

"configValue": La valeur de la config
</div>


### Send
Envoyer les nouvelles configs :
``/app/sendToUser/{USERID}``

Objet à envoyer : JSON
<div style="border-style:solid; padding: 2px;">

  "configName": Le nom de la config,

  "configValue": La valeur de la config
</div>
