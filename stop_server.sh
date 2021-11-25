#!/bin/bash
cd '/tmp'
if ps -p $(cat ./pid.file) > /dev/null
then
   kill $(cat ./pid.file)
fi