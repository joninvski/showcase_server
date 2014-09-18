import csv
import pdb

def create_sql(seq, name, category, text, url, url_logo, url_image):

    sql = 'insert into thing VALUES ( %d, "%s", "%s", "%s", "%s", "%s", "%s");' \
            % (seq, category, text, name, url, url_logo, url_image)
    print sql

with open('companies.csv', 'rb') as csvfile:
    reader = csv.reader(csvfile, delimiter=',')
    reader.next()                                   # Skip the first line
    seq = 1
    for name, category, text, url, url_logo, url_image in reader:
        create_sql(seq, name.strip(), category.strip(), text.strip(), url.strip(), url_logo.strip(), url_image.strip())
        seq += 1
