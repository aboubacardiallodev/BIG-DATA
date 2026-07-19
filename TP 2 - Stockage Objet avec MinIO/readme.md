# 🚀 Atelier Big Data : Stockage Objet avec MinIO (Travail de Synthèse)

Ce dépôt contient le guide, la configuration et les instructions pour le **Travail de Synthèse** de l'atelier sur le stockage objet avec MinIO. 
L'objectif est de construire une organisation de données par préfixes (dossiers logiques) dans MinIO via l'interface graphique, puis d'interagir avec ces données programmatiquement via l'API S3 en utilisant Postman.

---

## 📋 Table des matières
1. [Prérequis](#-prérequis)
2. [Structure du projet](#-structure-du-projet)
3. [Installation et Démarrage](#-installation-et-démarrage)
4. [Partie 1 : Interface Graphique MinIO](#-partie-1--interface-graphique-minio)
5. [Partie 2 : Manipulation via API avec Postman](#-partie-2--manipulation-via-api-avec-postman)
6. [Livrables attendus](#-livrables-attendus)
7. [Nettoyage de l'environnement](#-nettoyage-de-lenvironnement)

---

## ⚙️ Prérequis
Avant de commencer, assurez-vous d'avoir installé :
- [Docker](https://www.docker.com/) et [Docker Compose](https://docs.docker.com/compose/)
- [Postman](https://www.postman.com/downloads/)
- Un navigateur web (Chrome, Firefox, etc.)

---

## 📁 Structure du projet
Votre espace de travail local doit ressembler à ceci :

```text
atelier-minio/
├── docker-compose.yml
├── README.md
└── data/
    ├── ventes.csv
    ├── clients.json
    ├── application.log
    ├── produit.txt
    └── document.txt       <-- Fichier supplémentaire pour le préfixe 'documents/'