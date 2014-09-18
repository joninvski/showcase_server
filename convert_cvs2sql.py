import csv
import pdb

from PIL import Image         # python-imaging
import urllib

def create_sql(seq, name, category, text, homepage, url_logo, url_product):

    print name
    urllib.urlretrieve(url_logo, "logo.jpg")
    urllib.urlretrieve(url_product, "product.jpg")

    im = Image.open("logo.jpg")
    logoX, logoY = im.size

    im = Image.open("product.jpg")
    productX, productY = im.size

    sql = 'insert into thing VALUES ( %d, "%s", "%s", "%s", "%s", "%s", "%s", %d, %d, %d, %d);' \
            % (seq, name, text, category, homepage, url_logo, url_product, logoX, logoY, productX, productY)
    print sql

with open('companies.csv', 'rb') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    reader.next()                                   # Skip the first line
    seq = 1
    for name, category, text, homepage, url_logo, url_product in reader:
        create_sql(seq, name.strip(), category.strip(), homepage.strip(), text.strip(), url_logo.strip(), url_product.strip())
        seq += 1
