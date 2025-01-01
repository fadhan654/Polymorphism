from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

responses = []

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/question', methods=['GET', 'POST'])
def question():
    if request.method == 'POST':
        date = request.form.get('date', '').strip()  # Get and trim input
        if not date:  # Check if the date is empty
            return redirect(url_for('error'))
        responses.append(date)
        return redirect(url_for('thank_you'))
    return render_template('question.html')

@app.route('/thank_you')
def thank_you():
    return render_template('thank_you.html')

@app.route('/error')
def error():
    return render_template('error.html')

@app.route('/responses')
def show_responses():
    return render_template('responses.html', responses=responses)

if __name__ == '__main__':
    app.run(debug=True)
