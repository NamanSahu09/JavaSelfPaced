import openai
openai.api_key = "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"

def chat_with_gpt(prompt):
  response = openai.ChatCompletion.create(
    model="gpt-3.5-turbo",
    messages=[
      {"role": "user", "content": prompt},
    ]
  )
  return response.choices[0].message.content.strip()

if __name__ == "__main__":
  while True:
    user_input = input("You: ")
    if user_input.lower() in ['quit']