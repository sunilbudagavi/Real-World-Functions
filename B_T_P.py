def process_transactions(transactions, initial_balance):
    balance = initial_balance
    for transaction in transactions:
        if transaction['type'] == 'deposit':
            balance += transaction['amount']
        elif transaction['type'] == 'withdrawal':
            balance -= transaction['amount']
    return balance

transactions = [
    {'type': 'deposit', 'amount': 100},
    {'type': 'withdrawal', 'amount': 50},
    {'type': 'deposit', 'amount': 200}
]

print(process_transactions(transactions, 1000))
