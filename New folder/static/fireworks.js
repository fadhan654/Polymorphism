document.addEventListener("DOMContentLoaded", () => {
    const fireworkContainer = document.getElementById("firework-container");

    function createFirework() {
        const firework = document.createElement("div");
        firework.className = "firework";
        firework.style.left = `${Math.random() * 100}vw`;
        firework.style.animationDuration = `${Math.random() * 2 + 1}s`;

        fireworkContainer.appendChild(firework);

        setTimeout(() => firework.remove(), 3000);
    }

    setInterval(createFirework, 500);
});
