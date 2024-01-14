#!/bin/bash

# Install Ansible
sudo apt-get update
sudo apt-get install -y ansible

# Setup SSH Key
mkdir "$HOME/.ssh"
echo "${SSH_KEY}" > "$HOME/.ssh/id_rsa"
chmod 700 "$HOME/.ssh/"
chmod 600 "$HOME/.ssh/id_rsa"
