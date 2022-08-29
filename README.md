# examples-for-winforms-in-clojure-clr
Some examples for Windows Forms written in Clojure CLR

It may not working on the offical release of Clojure CLR v1.11.0, because that version links to an old version of System.Drawing.Common.dll . So, if you want to let it work, you should fork the offical git repository of Clojure CLR, then use an new version of System.Drawing.Common.dll, build your customed Clojure CLR binary, filally you can run this code on your special version.
