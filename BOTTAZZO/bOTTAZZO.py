import discord
import os
from keep_alive import keep_alive
import random
from discord.ext.commands import Bot
from discord.ext import commands
import asyncio
import time

#---------------------------------------------------------------

frasi_per_bruno = ["Bruno noi ci inginocchiamo a te", "O sommo bruno perdona i miei peccati", "La prego sommo poeta mi ripeta le 3 P", "L'amore per Bruno pervade il nostro innocente cuoricino", "mamma mia brunoh"]

frasi_contro_colo = ["gay", "stronzo", "merda", "DSA", "eretico di bruno vellone", "homo"]

#---------------------------------------------------------------

bump_msg = discord.Embed(
title="Il server è bumpabile",
description="Fai !d bump e buona permanenza",
colour=discord.Color.dark_green()
)

help_msg = discord.Embed(
title="Ecco le regole per il bOTTAZZO",
description="https://youtu.be/O91DT1pR1ew",
colour=discord.Color.orange()
)

help_msg.add_field(name="1", value= "Scrivi $embed#-#- con delle parole al posto dei - per mandare un messaggio embed personalizzato suwoo", inline=False)
help_msg.add_field(name="2", value="Scrivi Bruno vellone nostro dio per una frase speciale riferita al bruno randomica", inline=False)
help_msg.add_field(name="3", value="Se oserai scrivere nella stessa frase la parola colo seguita da una parola tra queste:" + str(frasi_contro_colo) + "il messaggio verrà cancellato e ti becchereai una bella sculacciata", inline=False)
help_msg.add_field(name="4", value="Scrivi $clear#- con un numero al posto del - per eliminare e punire voracemente qualche testa calda", inline=False)
help_msg.add_field(name="5", value="{Solo per alcuni server} Scrivi !d bump per bumpare quando arriva il messaggio di bump disponibile", inline=False)
help_msg.add_field(name = "6", value = "Si, poco fa sei stato rick rollato", inline=False)
help_msg.set_image(url = "https://s4.gifyu.com/images/narondo.gif")

cont = True
#---------------------------------------------------------------

client = discord.Client()

@client.event
async def on_ready():
	print("We have logged in as {0.user}".format(client))
	activity = discord.Game(name="Anal Sex")
	await client.change_presence(status=discord.Status.idle, activity=activity)
	await client.get_channel(821021049268863050).send("bot is online")

@client.event
async def on_message(message):
	global cont

	if message.author == client.user:
		return

	if "colo" in message.content:
		for i in frasi_contro_colo:
			if i in message.content:
				await message.channel.purge(limit=1)
				await message.channel.send("Eresia che cazzo dici")

	if message.content == "$help":
		await message.channel.send(embed = help_msg)

	if message.content == "Bruno vellone nostro dio":
		await message.channel.send(random.choice(frasi_per_bruno))

	if message.content.startswith("$embed"):
		await message.channel.purge(limit=1)
		bg = message.content.split("#")
		embed = discord.Embed(title=bg[1],
		description = bg[2],
		color = discord.Color.purple())
		await message.channel.send(embed=embed)

	if message.content.startswith("$clear"):
		ad = message.content.split("#")
		aj = int(ad[1])
		await message.channel.purge(limit=aj)

	if cont == True:
		if message.content == "!d bump":
			cont = False
			time.sleep(7200)
			await message.channel.send(embed = bump_msg)
		cont = True

@client.event
async def on_member_join(member):
	pannello = client.get_channel(821021049268863050)
	await message.channel.send("WA", member.name, "ENTRASTI")


keep_alive()
client.run(os.getenv("TOKEN"))

#---------------------------------------------------------------
