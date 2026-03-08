// Last updated: 3/8/2026, 6:19:08 PM
import pandas as pd

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    return students.astype({'grade': int})