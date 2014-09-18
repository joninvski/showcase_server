import csv
import pdb
import sys

from PIL import Image         # python-imaging
import urllib

def create_sql(f, seq, name, category, text, homepage, url_logo, url_product):

    sys.stderr.write(name + '\n')

    urllib.urlretrieve(url_logo, "logo.jpg")
    urllib.urlretrieve(url_product, "product.jpg")

    im = Image.open("logo.jpg")
    logoX, logoY = im.size

    im = Image.open("product.jpg")
    productX, productY = im.size
    name = name.replace('"','\\"')
    text = text.replace('"','\\"')

    sql = 'insert into thing VALUES ( %d, "%s", "%s", "%s", "%s", "%s", "%s", %d, %d, %d, %d);\n'  % (
            seq,
            name,
            text, 
            category, 
            homepage, 
            url_logo,
            url_product,
            logoX, logoY, productX, productY)

    f.write(sql)

with open('companies.csv', 'rb') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    reader.next()                                   # Skip the first line
    seq = 1

    f = open('populate_db.sql', 'w')
    for name, category, text, homepage, url_logo, url_product in reader:
        create_sql(f, seq, name.strip(), category.strip(), text.strip(), homepage.strip(),  url_logo.strip(), url_product.strip())
        seq += 1

    f.close()
