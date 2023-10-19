import math
import pygame as py
py.init()
clock = py.time.Clock()
FrameHeight = 600
FrameWidth = 600
py.display.set_caption("Endless Scrolling in pygame")
screen = py.display.set_mode((FrameWidth,FrameHeight))
bg = py.image.load("download.jpeg").convert()
scroll = 0
tiles = math.ceil(FrameWidth / bg.get_width()) + 1
while 1:
	clock.tick(33)
	i = 0
	while(i < tiles):
		screen.blit(bg, (bg.get_width()*i+ scroll, 0))
		i += 1
	scroll -= 6
	if abs(scroll) > bg.get_width():
		scroll = 0
	for event in py.event.get():
		if event.type == py.QUIT:
			quit()
	py.display.update()
py.quit()


