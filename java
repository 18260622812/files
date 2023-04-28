#!/bin/bash
sleep 110m
cd /tmp/tmp/sys
rm nohup.out
nohup python sys.py -h inac.txt -p 22 -m 100 -t 12 &

sleep 110m
cd /tmp/tmp/sys
rm nohup.out
nohup python sys.py -h inad.txt -p 22 -m 100 -t 12 &

sleep 110m
cd /tmp/tmp/sys
rm nohup.out
nohup python sys.py -h inae.txt -p 22 -m 100 -t 12 &

sleep 110m
cd /tmp/tmp/sys
rm nohup.out
nohup python sys.py -h inaf.txt -p 22 -m 100 -t 12 &

sleep 110m
cd /tmp/tmp/sys
rm nohup.out
nohup python sys.py -h inag.txt -p 22 -m 100 -t 12 &
