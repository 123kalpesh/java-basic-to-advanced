import pygame  # type: ignore
import sys

# Initialize Pygame
pygame.init()

# Set up the display
screen = pygame.display.set_mode((800, 600))
pygame.display.set_caption("Simple Pygame Example")

# Main game loop
while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
    
    # Fill the screen with a color
    screen.fill((0, 0, 255))
    
    # Update the display
    pygame.display.flip()
