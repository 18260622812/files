#!/bin/bash

for i in {1..20}
do

cd /var/tmp/.../tom
nohup python tom.py -h "x"$i".txt" -m 500 -t 16 &
sleep 80m

done
