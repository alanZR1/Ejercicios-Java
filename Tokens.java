// codigo de ejemplo de generacion de tokens JWT en Java usando la libreria jjwt


//import io.jsonwebtoken.Jwts;

/*public String generateToken(UserDetails user) {
    return Jwts.builder()
            .setSubject(user.getUsername())
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hora
            .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
            .compact();
}
            
*/


///// filtro de ejemplo para validar un token 


/*public class JwtFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(...) {
        // aquí validas el token en cada request
    }
}
 */