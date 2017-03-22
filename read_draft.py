In [1]: import pandas as pd
^[[A^[[A
In [2]: cols = pd.read_csv("columns.txt").columns.values

In [3]: dat = pd.read_csv("HPC2N-2002-2.2-cln.swf",delimiter='\\s+',skiprows=45,names=cols)

In [4]: dat.head()

